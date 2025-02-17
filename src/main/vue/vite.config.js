
import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import eslint from 'vite-plugin-eslint';
import path, { dirname } from 'path';
import { fileURLToPath } from 'url';

const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);

// Прокси для API запросов
const proxyConfig = {
  target: 'http://localhost:8080', // Адрес вашего Spring Boot сервера
  changeOrigin: true,
  secure: false,
};

// Конфигурация Vite
export default defineConfig({
  root: './', // Корень проекта (папка Vue)
  plugins: [
    vue({
      script: {
        defineModel: true, // Поддержка defineModel в Vue 3.3+
      },
    }),
    eslint(),
  ],
  resolve: {
    alias: {
      '@': path.resolve(__dirname, 'src'), // Упрощение путей к папке src
    },
    extensions: ['.vue', '.js', '.ts'], // Расширения для автоматического импорта
  },
  server: {
    host: 'localhost',
    port: 3000, // Порт разработки
    proxy: {
      '/api': proxyConfig, // Проксирование запросов к бэкенду
    },
  },
  build: {
    outDir: path.resolve(__dirname, '../../../target/classes/static'), // Куда сохранять собранные файлы (в папку static Spring Boot)
    rollupOptions: {
      input: {
        main: './indexVue.html', // Главный HTML файл
      },
      output: {
        manualChunks(id) {
          if (id.includes('node_modules')) {
            return id.toString().split('node_modules/')[1].split('/')[0].toString();
          }
        },
      },
    },
    emptyOutDir: true, // Удаляет старые файлы перед сборкой
  },
});
