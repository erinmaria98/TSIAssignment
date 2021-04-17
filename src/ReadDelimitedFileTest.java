import static org.testng.Assert.assertEquals;

public class ReadDelimitedFileTest extends ReadDelimitedFile {

        @Test
        void getFileDataFirstLineFirstColumn() {
            assertEquals("firstNam",loadDelimitedFile.getFileData("customer.csv").get(0)[0]);
        }

        @Test
        void getFileDataFirstLineSize() {
            assertEquals(5,loadDelimitedFile.getFileData("customer.csv").get(0).length );
        }

        @Test
        void getFileDataFirstLineFirstColumnStub(){
            loadDelimitedFile.setLoadFile(new Stub.LoadStub());
            assertEquals("John",loadDelimitedFile.getFileData("customer.csv").get(0)[0]);
        }

        @Test
        void getFileDataFirstLineSizeStub() {
            loadDelimitedFile.setLoadFile(new Stub.LoadStub());
            assertEquals(3,loadDelimitedFile.getFileData("customer.csv").get(0).length );
        }

        @Test
        void setFileDelimitorStub() {
            loadDelimitedFile.setLoadFile(new Stub.LoadStub());
            loadDelimitedFile.setFileDelimitor("n");
            assertEquals("Joh",loadDelimitedFile.getFileData("customer.csv").get(0)[0]);
        }

    }
}