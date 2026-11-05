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

const SideBar = () => {
    const [isOpen, setIsOpen] = useState(false);


    return (
        <div className="fixed-header">
            <Nav vertical>
                <NavItem>
                    <NavLink href="#">
                        Link
                    </NavLink>
                </NavItem>
                <NavItem>
                    <NavLink href="#">
                        Link
                    </NavLink>
                </NavItem>
                <NavItem>
                    <NavLink href="#">
                        Another Link
                    </NavLink>
                </NavItem>
                <NavItem>
                    <NavLink
                        disabled
                        href="#"
                    >
                        Disabled Link
                    </NavLink>
                </NavItem>
            </Nav>
        </div>
    );
};

export default SideBar;