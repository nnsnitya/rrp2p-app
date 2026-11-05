import { useEffect } from "react";
import Base from "../components/Base";
import { Container } from "reactstrap";

const Home = () => {

    useEffect(() => {
        //load all the posts from server
    }, []);
    return (
        <Base>
            <Container className="mt-3">
                <div>
                    <h1>This is Home page</h1>
                </div>
            </Container>
        </Base>
    );
};

export default Home;