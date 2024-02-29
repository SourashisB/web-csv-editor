'use client'

import React from "react";
import styles from './filetable.module.css'

type TableProps = {
    rowNumber: number
}


const FileTable: React.FC<TableProps> = ({rowNumber}) => {
    const columns = ['File Name',"Last Edited",""]
    const rows = Array.from({length: rowNumber}, (_,index) => index+1)
    const handleEdit = (rowIndex: number) => {
        console.log('button pressed ', rowIndex)
    }
    
    const EditButton: React.FC = () => {
        return (
            <button className={styles.editButton} onClick={() => handleEdit(rowNumber)}>
                Edit
            </button>
        )
    }

    const DeleteButton: React.FC = () => {
        return(
            <button className={styles.deleteButton}>
                Delete
            </button>
        )
    }
    
    return (
        <table className={styles.table}>
            <thead>
                <tr>
                    {columns.map((column, index) => (
                        <th key={index}>{column}</th>
                    ))}
                </tr>
            </thead>
            <tbody>
                {rows.map((rowCount) => (
                    <tr key={rowCount}>
                        <td>Row</td>
                        <td>Row</td>
                        <td>
                            <EditButton/>
                            <DeleteButton/>
                        </td>
                    </tr>
                ))}
            </tbody>
        </table>
    )
}

export default FileTable;