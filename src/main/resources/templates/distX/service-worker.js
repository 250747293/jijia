importScripts("/precache-manifest.fa352166ff86f58fd0e769b72cd2740b.js");


        importScripts('/static/workbox-v3.6.3/workbox-sw.js');
        workbox.setConfig({
            modulePathPrefix: '/static/workbox-v3.6.3/'
        });
    /**
 * @file service-worker.js with workbox api
 * @desc [example](https://workbox-samples.glitch.me/examples/workbox-sw/)
 * @author jiu3bao(514659849@qq.com)
 */

/* globals workbox */
workbox.core.setCacheNameDetails({
    prefix: 'lavas-cache',
    suffix: 'v1',
    precache: 'install-time',
    runtime: 'run-time',
    googleAnalytics: 'ga'
});
workbox.skipWaiting();
workbox.clientsClaim();

workbox.precaching.precacheAndRoute(self.__precacheManifest || []);

/**
 * example runningCache with api
 */
// workbox.routing.registerRoute(/^https:\/\/lavas\.baidu\.com\/some\/api/,
//     workbox.strategies.networkFirst());


/**
 * example runningCache with resources from CDN
 * including maxAge, maxEntries
 * cacheableResponse is important for CDN
 */
// workbox.routing.registerRoute(/^https:\/\/cdn\.baidu\.com/i,
//     workbox.strategies.cacheFirst({
//         cacheName: 'lavas-cache-images',
//         plugins: [
//             new workbox.expiration.Plugin({
//                 maxEntries: 100,
//                 maxAgeSeconds: 7 * 24 * 60 * 60
//             }),
//             new workbox.cacheableResponse.Plugin({
//                 statuses: [0, 200]
//             })
//         ]
//     })
// );
workbox.routing.registerNavigationRoute('/index.html');
