import './Navbar.css';


const NAV_IMG_URL = 'https://cdn.dribbble.com/users/1769954/screenshots/4216600/media/f1ed192ec1c5300d413fac7fb076f7d0.png';

const Navbar = (props) => {
    const links = props.links;



    const navLinks = links.map((text, index) => (
        <a href="/" key={index}>{text}</a>
    ));

    return ( 
        <nav className="navbar">
            <div className="nav--container">
                <div className="nav--left">
                    <img src={NAV_IMG_URL} alt="space-logo"/>
                    <h1 className="nav--title">
                        Space-app
                    </h1>
                </div>
                <div className="nav--right">
                    <div className='nav--links'>
                        {navLinks}
                    </div>
                </div>
            </div>
        </nav>
    )
}

export default Navbar;