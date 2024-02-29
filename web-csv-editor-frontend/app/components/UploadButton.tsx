'use client'
import React from "react";
import styles from './uploadbutton.module.css'

const UploadButton: React.FC = () => {
    return (

        <button className={styles.uploadButton} onClick={() => console.log('click')}>Upload file</button>

    )
}

export default UploadButton;