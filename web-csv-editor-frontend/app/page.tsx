import Image from "next/image";
import styles from './styles.module.css'
import FileTable from "./components/FileTable";
import UploadButton from "./components/UploadButton";

export default function Home() {
  return (
    <div>
      <h1 className={styles.title}>Web CSV Editor</h1>
      <FileTable rowNumber={4} />
      <br />
      <div style={{display: 'flex', justifyContent: 'flex-end', width: '95%'}}>
        <UploadButton />
      </div>
    </div>
  );
}
