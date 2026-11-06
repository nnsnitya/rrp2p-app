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
                <Col md={isSidebarOpen ? 3 : 1} className="fixed-sidebar">


                    <SideBar collapsed={!isSidebarOpen} toggleSidebar={toggleSidebar} />
                </Col>

                {/* Main Content */}
                <Col md={isSidebarOpen ? 9 : 11}>
                    <main className="page-content">
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