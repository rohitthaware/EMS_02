import { BrowserRouter, Route, Switch } from 'react-router-dom'
import Signin from './pages/signin'
import Forgotpassword from './pages/forgotpassword';
import Dashboard from './pages/dashboard';
import './App.css';
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'

function App() {
  return (
    <div className="background">
      <br />
      <BrowserRouter>
        <div className="container">
          <Switch>
            <Route path="/" exact component={Signin} />
            <Route path="/signin" component={Signin} />
            <Route path="/forgetpassword" component={Forgotpassword} />
            <Route path="/dashboard" component={Dashboard} />
          </Switch>
        </div>
        <br /><br />
      </BrowserRouter>
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
