import { useEffect, useState } from "react";


const API_URL = 'http://api.open-notify.org/astros.json';

const Astros = () => {
    const [data, setData] = useState([]);

    const fetchData = () => {
        fetch(API_URL)
            .then(res => res.json())
            .then(data => setData(data))
            .catch(err => console.error(err));
    }

    useEffect(() => {
        fetchData();
    }, []);

    console.log(data);

}

export default Astros;