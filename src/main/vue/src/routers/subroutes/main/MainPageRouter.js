const MainView = () => import("@/views/main/MainView")

export const MainPage = [
    {
        path: '/',
        name: "MainView",
        component: MainView,
        props: (route) => route.query,
        meta: {
            pageTitle: "Albion Tools"
        }
    }
]