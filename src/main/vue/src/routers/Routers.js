import {createRouter, createWebHistory} from 'vue-router';
import {MainPage} from "@/routers/subroutes/main/MainPageRouter";

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        ...MainPage
    ]
});

export default router;