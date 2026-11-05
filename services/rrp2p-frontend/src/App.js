import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Home from './pages/Home';
import About from './pages/About';
import Contactus from './pages/Contactus';
import Services from './pages/Services';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        {/* <ToastContainer position='bottom-right' /> */}
        <Routes>
          <Route path='/' element={<Home />} />
          {/* <Route path='/login' element={<Login />} /> */}

          {/* <Route path='/signup' element={<Signup />} /> */}
          {/* <Route path='/posts/:postId' element={<PostDetail />} /> */}
          {/* <Route path='/categories/:categoryId' element={<Categories />} /> */}
          <Route path='/about' element={<About />} />
          <Route path='/services' element={<Services />} />
          <Route path='/contactus' element={<Contactus />} />
          {/* <Route path='/profile' element={<Profile />} /> */}

          {/* <Route path='/user' element={<Privateroutes />}>
            <Route path='dashboard' element={<Userdashboard />} />
            <Route path='profile-info' element={<Profileinfo />} />
          </Route> */}
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
