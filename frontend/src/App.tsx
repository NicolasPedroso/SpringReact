import './App.css'

import {
  BrowserRouter as Router,
  Routes,
  Route,
} from 'react-router-dom';

import Home from './pages/home'
import Pagina from './pages/pagina'

function App() {
  return (
    <Router basename="/SisLAMIR">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/pagina" element={<Pagina />} />
      </Routes>
    </ Router>
  )
}

export default App