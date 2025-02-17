<script setup>
import {RouterView} from "vue-router";

window.addEventListener('vite:preloadError', () => {
  alert("Ошибка загрузки ресурсов сервера!");
  window.top.location.replace(window.location.origin + "/");
})
</script>

<template>
  <RouterView />
</template>