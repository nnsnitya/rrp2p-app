// import React, { useContext, useEffect, useState } from "react";
import { NavLink as ReactLink } from "react-router-dom";
import {
    Collapse, DropdownItem, DropdownMenu, DropdownToggle, Nav, Navbar,
    NavbarBrand, NavbarToggler, NavItem, NavLink, UncontrolledDropdown
} from "reactstrap";
// import { doLogout, getCurrentUser, isLoggedIn } from "../auth";
// import userContext from "../context/userContext";
import "../assets/css/Fixedbars.css";
import { useState } from "react";

const BrandNavbar = () => {
    const [isOpen, setIsOpen] = useState(false);


    return (
        <div className="fixed-header">
            <Navbar color='dark' dark expand="md" fixed='' className='px-5'>
                <NavbarBrand tag={ReactLink} to="/">RRP2P Logo</NavbarBrand>
                <NavbarToggler onClick={() => setIsOpen(!isOpen)} />
                <Collapse isOpen={isOpen} navbar>
                    <Nav className="me-auto" navbar>
                        <NavItem>
                            <NavLink tag={ReactLink} to="/">New Feed</NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink tag={ReactLink} to="/about">About</NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink tag={ReactLink} to="/services">Services</NavLink>
                        </NavItem>

                        <UncontrolledDropdown nav inNavbar>
                            <DropdownToggle nav caret>
                                More
                            </DropdownToggle>
                            <DropdownMenu right>
                                <DropdownItem tag={ReactLink} to="/contactus">Contact Us</DropdownItem>
                                <DropdownItem>Facebook</DropdownItem>
                                <DropdownItem divider />
                                <DropdownItem>Youtube</DropdownItem>
                                <DropdownItem>Instagram</DropdownItem>
                                <DropdownItem>LinkedIn</DropdownItem>
                            </DropdownMenu>
                        </UncontrolledDropdown>
                    </Nav>
                </Collapse>
            </Navbar>
        </div>
    );
};

export default BrandNavbar;