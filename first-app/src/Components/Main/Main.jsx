// CSS externo
// CSS Inline
// CSS JSON

const titleStyle = {
    color: 'white',
    backgroundColor: 'red',
}


function Main({name, age}) {
 
    return (
        <>
            <h1 style={titleStyle}>
                Welcome, {name}
            </h1>

            <h3
                style={{
                    color: 'red',
                    backgroundColor: 'white',
                }}
            >
                {age}
            </h3>
        </>
    )
}


export default Main;