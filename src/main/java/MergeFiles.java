import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class MergeFiles {
    private static String sourcePath0 = "C:\\Users\\shakd\\Desktop\\testFolder\\1\\";
    private static String sourcePath1 = "C:\\Users\\shakd\\Desktop\\testFolder\\2\\";
    private static String destPath = "C:\\Users\\shakd\\Desktop\\testFolder\\3\\";

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        PDFMergerUtility mu = new PDFMergerUtility();

        File[] filesInDirectory = new File(sourcePath0).listFiles((dir, name) -> name.endsWith(".pdf"));

        int numberOfFiles = filesInDirectory.length;
        System.out.println(numberOfFiles + " files in " + sourcePath0);

        ArrayList<Packet> packets = new ArrayList<>();
        for (int i = 0; i < numberOfFiles; i++) {
            System.out.println("File #" + i + ": " + filesInDirectory[i].getName());
            System.out.println("Adding " + filesInDirectory[i].getName().substring(0,filesInDirectory[i].getName().indexOf(".")) + " to Array List as ClaimNbr");
            packets.add(new Packet(filesInDirectory[i].getName().substring(0,filesInDirectory[i].getName().indexOf("."))));
            //mu.addSource(sourcePath0 + filesInDirectory[i].getName());
        }
        for (int i =0; i<packets.size(); i++) {
            System.out.println("Element " + i + " of Array List: " + packets.get(i).getClaimNbr());
        }
        //mu.setDestinationFileName(destPath + "testMerge.pdf");
        //mu.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
    }


/*    public static ArrayList<FileData> processDocuments(String pathname, int numberOfFiles, ArrayList<FileData> filesdata) throws IOException {

        String[] filesInDirectory = new File(pathname).list((dir, name) -> name.endsWith(".pdf"));

        ArrayList<Integer> pageCounts = new ArrayList<>();
        ArrayList<Document> documentList = new ArrayList<>();

        System.out.println("Identifying document page counts: " + sysdate.format(LocalDateTime.now()) );
        sb.append("\nIdentifying document page counts: " + sysdate.format(LocalDateTime.now()) );

        // loop through all documents in folder, grab filename & pagecounts.



        // used set to capture distinct page count values
        Set<Integer> uniquePageCounts = new HashSet<>(pageCounts);

        System.out.println("Creating & populating subdirectories: " + sysdate.format(LocalDateTime.now()) );
        sb.append("\nCreating & populating subdirectories: " + sysdate.format(LocalDateTime.now()) );

        // create subfolders based on unique pagecounts
        for (int pageCount : uniquePageCounts) {
            String folderName = pathname + "\\" + String.format("%02d", pageCount) + "_Pages";

            if (!Files.exists(Paths.get(folderName))) {
                Files.createDirectory(Paths.get(folderName));

                Path originalDirectory;
                Path newDirectory;

                for (int i = 0; i < documentList.size(); i++) {
                    if (documentList.get(i).getPageCount() == pageCount) {
                        originalDirectory = Paths.get(pathname + "\\" + documentList.get(i).getName());
                        newDirectory = Paths.get(folderName + "\\" + documentList.get(i).getName());
                        Files.move(originalDirectory, newDirectory);
                    }
                }
            }
        }
        return filesdata ;
    }*/

}


