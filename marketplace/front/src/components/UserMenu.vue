<template>
    <v-menu transition="scale-transition" origin="top center">
      <template v-slot:activator="{ on, attrs }">
        <v-btn
          dark
          icon
          v-bind="attrs"
          v-on="on"
        >
          <v-icon> mdi-account </v-icon>
        </v-btn>
      </template>
    <v-list flat>
      <v-list-item-group v-model="item">
        <v-list-item
          v-for="(item, i) in items"
          :key="i"
        >
          <v-list-item-icon>
            <v-icon v-text="item.icon"></v-icon>
          </v-list-item-icon>
          <v-list-item-content>
            <v-list-item-title v-text="item.text"></v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list-item-group>
    </v-list>
    </v-menu>
</template>

<script>
export default {
  data: () => ({
    item: 1,
    items: [
      { text: '로그아웃', icon: 'mdi-account-off' },
      { text: '내 정보', icon: 'mdi-account-search' }
    ]
  })
}
</script>
