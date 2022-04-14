import { BrowserRouter, Route, Switch } from 'react-router-dom'
import Signin from './pages/signin'
import Forgotpassword from './pages/forgotpassword';
import Signup from './pages/signup';
import Dashboard from './pages/dashboard';
import './App.css';
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'
import  HeaderComponent from './components/HeaderComponent'

function App() {
  return (
    <div className="background">
      <HeaderComponent/>
      <br />
      <BrowserRouter>
        <div className="container">
          <Switch>
            <Route path="/" exact component={Signin} />
            <Route path="/signin" component={Signin} />
            <Route path="/forgetpassword" component={Forgotpassword} />
            <Route path="/signup" component={Signup} />
            <Route path="/dashboard" component={Dashboard} />
          </Switch>
        </div>
        <br /><br />
      </BrowserRouter>
      {/* <ToastContainer theme="light"/> */}
      <ToastContainer
position="top-center"
autoClose={2000}
hideProgressBar={false}
newestOnTop={false}
closeOnClick
rtl={false}
pauseOnFocusLoss
draggable
pauseOnHover
/>
    </div>
  )
}

export default App;
