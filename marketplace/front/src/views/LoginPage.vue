<template>
  <div class="login">
  <form class="form-signin" @submit.prevent="submitForm">
    <div class="text-center mb-4">
      <img class="mb-4" src="../assets/svcLogoWithoutFrames.svg" alt="" width="200" height="100">
      <h1 class="h3 mb-3 font-weight-normal">로그인</h1>
      <!--
      <p>Build form controls with floating labels via the <code>:placeholder-shown</code> pseudo-element. <a
          href="https://caniuse.com/#feat=css-placeholder-shown">Works in latest Chrome, Safari, and Firefox.</a></p>-->
    </div>

    <div v-show="errorMessage" class="alert alert-danger failed">{{ errorMessage }}</div>

    <div class="form-label-group">
      <input type="text" v-model="form.username" id="Id" class="form-control" placeholder="아이디" autofocus>
      <label for="Id">아이디</label>
         <div class="field-error" v-if="$v.form.username.$dirty">
          <div class="error text-danger" v-if="!$v.form.username.required">이메일 혹은 아이디를 입력하세요.</div>
          </div>
    </div>

    <div class="form-label-group">
      <input type="password" v-model="form.password" id="Pass" class="form-control" placeholder="비밀번호" >
      <label for="Pass">비밀번호</label>
          <div class="field-error" v-if="$v.form.password.$dirty">
          <div class="error text-danger" v-if="!$v.form.password.required">비밀번호를 입력하세요.</div>
          </div>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> 아이디 저장
      </label>
    </div>
    <button class="btn btn-lg btn-info btn-block mb-3 login_btn" type="submit">로그인</button>
    <ul class="nav justify-content-center">
      <li class="nav-item">
        <a class="nav-link" href="#">아이디 찾기</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">비밀번호 찾기</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">회원가입</a>
      </li>
    </ul>
    <p class="mt-5 mb-3 text-muted text-center">&copy; 2020 <a href="http://bashpound.github.io">Bashpound.github.io</a>
    </p>
  </form>
  </div>
</template>

<script>
import { required } from 'vuelidate/lib/validators'
import authenticationService from '@/services/authentication'

export default {
  name: 'LoginPage',
  data: function () {
    return {
      form: {
        username: '',
        password: ''
      },
      errorMessage: ''
    }
  },
  validations: {
    form: {
      username: {
        required
      },
      password: {
        required
      }
    }
  },
  methods: {
    submitForm () {
      this.$v.$touch()
      if (this.$v.$invalid) {
        return
      }

      authenticationService.authenticate(this.form).then(() => {
        authenticationService.fetchuser()
        this.$bus.$on('myDataFetched', data => {
          this.$store.commit('updateMyData', data)
        })
        this.$router.push({ name: 'Home' })
      }).catch((error) => {
        this.errorMessage = error.message
      })
    }
  }
}
</script>

<style scoped>
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      -ms-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }

    .form-signin {
      width: 100%;
      max-width: 420px;
      padding: 0px;
      margin: auto;
    }

    .form-label-group {
      position: relative;
      margin-bottom: 1rem;
      text-align:left;
    }

    .form-label-group>input,
    .form-label-group>label {
      height: 3.125rem;
      padding: .75rem;
    }

    .form-label-group>label {
      position: absolute;
      top: 0;
      left: 0;
      display: block;
      width: 100%;
      margin-bottom: 0;
      /* Override default `<label>` margin */
      line-height: 1.5;
      color: #495057;
      pointer-events: none;
      cursor: text;
      /* Match the input under the label */
      border: 1px solid transparent;
      border-radius: .25rem;
      transition: all .1s ease-in-out;
    }

    .form-label-group input::-webkit-input-placeholder {
      color: transparent;
    }

    .form-label-group input:-ms-input-placeholder {
      color: transparent;
    }

    .form-label-group input::-ms-input-placeholder {
      color: transparent;
    }

    .form-label-group input::-moz-placeholder {
      color: transparent;
    }

    .form-label-group input::placeholder {
      color: transparent;
    }

    .form-label-group input:not(:placeholder-shown) {
      padding-top: 1.25rem;
      padding-bottom: .25rem;
    }

    .form-label-group input:not(:placeholder-shown)~label {
      padding-top: .25rem;
      padding-bottom: .25rem;
      font-size: 12px;
      color: #777;
    }
/*
    .login_btn {
      color: white;
      background-color: #326094;
      border: none;
    }

    .login_btn:hover {
      background-color: #86bcd9;
    }

    .login_btn:active {
      background-color:lightgrey;
    }
  */
    .nav-link{
      color:black;
    }

    /* Fallback for Edge
-------------------------------------------------- */
    @supports (-ms-ime-align: auto) {
      .form-label-group>label {
        display: none;
      }

      .form-label-group input::-ms-input-placeholder {
        color: #777;
      }
    }

    /* Fallback for IE
-------------------------------------------------- */
    @media all and (-ms-high-contrast: none),
    (-ms-high-contrast: active) {
      .form-label-group>label {
        display: none;
      }

      .form-label-group input:-ms-input-placeholder {
        color: #777;
      }
    }
  </style>
