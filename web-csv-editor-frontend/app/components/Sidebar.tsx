'use client'


import React from "react";
import styles from "./sidebar.module.css";
import Link from "next/link";

function Sidebar() {
    return (
        <div className={styles.sidebar}>
            
            <nav className={styles.nav}>
                <h1 className={styles.title}>Options</h1>
                <Link className={styles.navItem} href="/" passHref>
                    Profile
                </Link>
                <Link className={styles.navItem} href="/" passHref>
                    Edit
                </Link>
                <Link className={styles.navItem} href="/" passHref>
                    Logout
                </Link>
            </nav>
        </div>
    );
};

export default Sidebar;