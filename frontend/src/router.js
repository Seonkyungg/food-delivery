
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import NotificationManager from "./components/listers/NotificationCards"
import NotificationDetail from "./components/listers/NotificationDetail"

import StatusView from "./components/StatusView"
import StatusViewDetail from "./components/StatusViewDetail"
import RiderManager from "./components/listers/RiderCards"
import RiderDetail from "./components/listers/RiderDetail"

import StoreManager from "./components/listers/StoreCards"
import StoreDetail from "./components/listers/StoreDetail"

import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/notifications',
                name: 'NotificationManager',
                component: NotificationManager
            },
            {
                path: '/notifications/:id',
                name: 'NotificationDetail',
                component: NotificationDetail
            },

            {
                path: '/statuses',
                name: 'StatusView',
                component: StatusView
            },
            {
                path: '/statuses/:id',
                name: 'StatusViewDetail',
                component: StatusViewDetail
            },
            {
                path: '/riders',
                name: 'RiderManager',
                component: RiderManager
            },
            {
                path: '/riders/:id',
                name: 'RiderDetail',
                component: RiderDetail
            },

            {
                path: '/stores',
                name: 'StoreManager',
                component: StoreManager
            },
            {
                path: '/stores/:id',
                name: 'StoreDetail',
                component: StoreDetail
            },

            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },



    ]
})
