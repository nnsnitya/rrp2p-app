import CustomNavbar from "./BrandNavbar";
import bgImage from "../assets/images/bg_image.jpg";
import "../assets/css/Base.css"
import { Button, Col, Row } from "reactstrap";
import SideBar from "./SideNavbar";
import { useState } from "react";


const Base = ({ title = "Welcome to our website", children }) => {
    const [isSidebarOpen, setIsSidebarOpen] = useState(true);
    const toggleSidebar = () => {
        setIsSidebarOpen(prev => !prev);
    };
    return (
        <div className="base-page" style={{ backgroundImage: `url(${bgImage})` }}>

            <CustomNavbar />
            <Row className="g-0">

                {/* Sidebar */}
                {isSidebarOpen && (
                    <Col md={3} className="fixed-sidebar">

                        <Button onClick={toggleSidebar}>
                            Hide Sidebar
                        </Button>

                        <SideBar />
                    </Col>
                )}

                {/* Main Content */}
                <Col md={isSidebarOpen ? 9 : 12}>
                    <main className="page-content">

                        {/* Show toggle when sidebar is hidden */}
                        {!isSidebarOpen && (
                            <Button onClick={toggleSidebar}>
                                Show Sidebar
                            </Button>
                        )}

                        {children}
                    </main>
                </Col>
            </Row>
            <footer className="footer mt-5">
                <h1>This is footer</h1>
            </footer>
        </div>
    );
};

export default Base;