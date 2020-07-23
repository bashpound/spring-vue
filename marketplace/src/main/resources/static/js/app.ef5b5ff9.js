(function(t){function e(e){for(var a,i,o=e[0],c=e[1],l=e[2],p=0,f=[];p<o.length;p++)i=o[p],Object.prototype.hasOwnProperty.call(n,i)&&n[i]&&f.push(n[i][0]),n[i]=0;for(a in c)Object.prototype.hasOwnProperty.call(c,a)&&(t[a]=c[a]);u&&u(e);while(f.length)f.shift()();return s.push.apply(s,l||[]),r()}function r(){for(var t,e=0;e<s.length;e++){for(var r=s[e],a=!0,o=1;o<r.length;o++){var c=r[o];0!==n[c]&&(a=!1)}a&&(s.splice(e--,1),t=i(i.s=r[0]))}return t}var a={},n={app:0},s=[];function i(e){if(a[e])return a[e].exports;var r=a[e]={i:e,l:!1,exports:{}};return t[e].call(r.exports,r,r.exports,i),r.l=!0,r.exports}i.m=t,i.c=a,i.d=function(t,e,r){i.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:r})},i.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},i.t=function(t,e){if(1&e&&(t=i(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var r=Object.create(null);if(i.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)i.d(r,a,function(e){return t[e]}.bind(null,a));return r},i.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return i.d(e,"a",e),e},i.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},i.p="/";var o=window["webpackJsonp"]=window["webpackJsonp"]||[],c=o.push.bind(o);o.push=e,o=o.slice();for(var l=0;l<o.length;l++)e(o[l]);var u=c;s.push(["56d7","chunk-vendors"]),r()})({"56d7":function(t,e,r){"use strict";r.r(e);r("d3b7"),r("e260"),r("e6cf"),r("cca6"),r("a79d");var a=r("2b0e"),n=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{attrs:{id:"app"}},[r("router-view")],1)},s=[],i={name:"App"},o=i,c=(r("5c0b"),r("2877")),l=Object(c["a"])(o,n,s,!1,null,null,null),u=l.exports,p=r("8c4f"),f=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},d=[function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",[r("h1",[t._v("Marketplace")])])}],v={name:"LoginPage"},m=v,g=Object(c["a"])(m,f,d,!1,null,null,null),b=g.exports,h=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},_=[function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"container"},[r("div",{staticClass:"row justify-content-center"},[r("div",{staticClass:"register-form"},[r("div",{staticClass:"logo-wrapper"},[r("img",{staticClass:"logo",attrs:{src:"/static/images/logo.png"}}),r("div",{staticClass:"tagline"},[t._v("Marketplace Application")])]),r("form",[r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"username"}},[t._v("Username")]),r("input",{staticClass:"form-control",attrs:{type:"text",id:"username"}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"emailAddress"}},[t._v("Email address")]),r("input",{staticClass:"form-control",attrs:{type:"email",id:"emailAddress"}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"password"}},[t._v("Password")]),r("input",{staticClass:"form-control",attrs:{type:"password",id:"password"}})]),r("button",{staticClass:"btn btn-primary btn-block",attrs:{type:"submit"}},[t._v("Create account")]),r("p",{staticClass:"accept-terms text-muted"},[t._v("By clicking “Create account”, you agree to our "),r("a",{attrs:{href:"#"}},[t._v("terms of service")]),t._v(" and "),r("a",{attrs:{href:"#"}},[t._v("privacy policy")]),t._v(".")]),r("p",{staticClass:"text-center text-muted"},[t._v("Already have an account? "),r("a",{attrs:{href:"/login"}},[t._v("Sign in")])])])])]),r("footer",{staticClass:"footer"},[r("span",{staticClass:"copyright"},[t._v("© 2018 TaskAgile.com")]),r("ul",{staticClass:"footer-links list-inline float-right"},[r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[t._v("About")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[t._v("Terms of Service")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[t._v("Privacy Policy")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"https://github.com/taskagile/vuejs.spring-boot.mysql",target:"_blank"}},[t._v("GitHub")])])])])])}],y={name:"RegisterPage"},C=y,w=(r("8a36"),Object(c["a"])(C,h,_,!1,null,"a0c757dc",null)),j=w.exports;a["a"].use(p["a"]);var P=[{path:"/login",name:"loginPage",component:b},{path:"/register",name:"RegisterPage",component:j}],O=new p["a"]({mode:"history",base:"/",routes:P}),x=O,k=r("2f62");a["a"].use(k["a"]);var A=new k["a"].Store({state:{},mutations:{},actions:{},modules:{}}),S=r("bc3a"),E=r.n(S),M=r("1dce"),$=r.n(M);E.a.defaults.baseURL="/api",E.a.defaults.headers.common.Accept="application/json",E.a.interceptors.response.use((function(t){return t}),(function(t){return Promise.reject(t)})),a["a"].use($.a),a["a"].config.productionTip=!1,new a["a"]({router:x,store:A,render:function(t){return t(u)}}).$mount("#app")},"5c0b":function(t,e,r){"use strict";var a=r("9c0c"),n=r.n(a);n.a},"5e86":function(t,e,r){},"8a36":function(t,e,r){"use strict";var a=r("5e86"),n=r.n(a);n.a},"9c0c":function(t,e,r){}});
//# sourceMappingURL=app.ef5b5ff9.js.map