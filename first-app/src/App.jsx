import Main from './Components/Main/Main';
import Navbar from './Components/Navbar/Navbar';
import Astros from './Components/Astros/Astros';
import './App.css'


const userData = {
  name: 'Zabdiel',
  age: '25'
}

// link para Personas en el espacio
// link para API NASA
// Logo / link para login o para ver perfil

const links = ['ASTROS', 'APOD', true];


function App() {

  return (
    <>
      <Navbar links={links} />
      <Astros />
      <Main {...userData} />
    </>
  )
}

export default App
