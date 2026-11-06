// import React, { useContext, useEffect, useState } from "react";
import '../assets/css/Lucidereact.css';
import { NavLink as ReactLink } from "react-router-dom";
import {
    Button,
    Collapse, DropdownItem, DropdownMenu, DropdownToggle, Nav, Navbar,
    NavbarBrand, NavbarToggler, NavItem, NavLink, UncontrolledDropdown
} from "reactstrap";
// import { doLogout, getCurrentUser, isLoggedIn } from "../auth";
// import userContext from "../context/userContext";
import "../assets/css/Fixedbars.css";
import { useState } from "react";
import { FileText, LayoutDashboard, PanelLeftClose, PanelLeftOpen, Settings, User } from "lucide-react";

const SideBar = ({ collapsed, toggleSidebar }) => {

    const menus = [
        { title: "Dashboard", icon: LayoutDashboard },
        { title: "Profile", icon: User },
        { title: "Order", icon: FileText },
        { title: "Settings", icon: Settings }
    ];

    const [isOpen, setIsOpen] = useState(true);

    return (
        <div className={`sidebar ${collapsed ? "collapsed" : ""}`}>
            <div className="fixed-header">
                <button onClick={toggleSidebar}>
                    {collapsed
                        ? <PanelLeftOpen size={20} />
                        : <PanelLeftClose size={20} />
                    }
                </button>
            </div>
            <Nav vertical>
                {menus.map((menu, index) => {
                    const Icon = menu.icon;

                    return (
                        <NavItem key={index}>
                            <NavLink href="#" title={collapsed ? menu.title : ""}>
                                <Icon size={20} />
                                {!collapsed && (
                                    <span>{menu.title}</span>
                                )}
                            </NavLink>
                        </NavItem>
                    );
                })}
            </Nav>

        </div>
    );
};

export default SideBar;