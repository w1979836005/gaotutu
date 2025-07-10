<script setup lang="ts">
import GlobalHeader from '@/components/GlobalHeader.vue'
</script>

<template>
  <div id="basicLayout">
    <a-layout>
      <a-layout-header class="header">
        <GlobalHeader />
      </a-layout-header>
      <a-layout-content class="content">
        <router-view />
      </a-layout-content>
      <a-layout-footer class="footer">
        <a href="/" target="_blank">@author by 高桥凉介</a>
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<style scoped>
#basicLayout .footer {
  background: #efefef;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  text-align: center;
  padding: 16px;
}
#basicLayout .content {
  padding: 30px;
  background: linear-gradient(to right, #fefefe, #fff);
}
#basicLayout .header {
  padding-inline: 20px;
  color: unset;
  background: white;
}
</style>
