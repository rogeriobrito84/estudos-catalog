import React, {useState, useEffect} from "react";
import Alert from "./Alert";

const App = () => {

    const [counter, setCounter] = useState(0);

    useEffect(() => {
        console.log("Conpomnete inicializou!");
    }, []);

    
    return (
        <div className="container mt-5">
           <button className="btn btn-primary mr-5"
           onClick={() => setCounter(counter - 1)}> - </button>
           <span>{counter}</span>
           <button className="btn btn-primary ml-5"
           onClick={() => setCounter(counter + 1)}> + </button>

           {counter > 5
            && <h1 className="mt-5">O valor é maior que 5</h1>}
        </div>
    );
}

export default App;