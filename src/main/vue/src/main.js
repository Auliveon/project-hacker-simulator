import {createApp} from 'vue'
import App from './App.vue'
import Routers from './routers/Routers';
import PrimeVue from 'primevue/config';
import { locale } from './assets/primevue-locale-ru';
import { createPinia } from 'pinia'
import {setLocale} from 'yup';
import {ru} from 'yup-locales';


setLocale(ru);

createApp(App)
    .use(Routers)
    .use(createPinia())
    .use(PrimeVue, { locale: locale.ru })
    .mount('#app')
