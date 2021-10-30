package stringmethods.filename;

public class FileNameManipulator {
    public char findLastCharacter(String str){
        return str.trim().charAt(str.trim().length()-1);
    }

    public String findFileExtension(String filename){
        int pos = filename.trim().lastIndexOf('.');
        if(pos<0){
            return "";
        }
        return filename.trim().substring(pos+1);
    }

    public boolean identifyFilesByExtension(String ext, String fileName){
        return ext.trim().equals(findFileExtension(fileName.trim()));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return actualFileName.trim().equals(searchedFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName){
        fileName = fileName.trim();
        String ext = findFileExtension(fileName);
        return fileName.substring(0, fileName.length()-ext.length()) + ext.toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target){
        return fileName.replace(present, target);
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter(" szöveg  "));
        System.out.println("\"" + fileNameManipulator.findFileExtension(" java.cheatsheet.pdf  ") + "\"");
        System.out.println("\"" + fileNameManipulator.findFileExtension(" javacheatsheetpdf  ") + "\"");
        System.out.println(fileNameManipulator.identifyFilesByExtension(" exe  ", " java.cheatsheet.pdf ")?"[fail]":"[pass]");
        System.out.println(fileNameManipulator.identifyFilesByExtension(" pdf  ", " java.cheatsheet.pdf ")?"[pass]":"[fail]");
        System.out.println(fileNameManipulator.compareFilesByName(" cheatsheet.pdf ", " java.cheatsheet.pdf ")?"[fail]":"[pass]");
        System.out.println(fileNameManipulator.compareFilesByName("  cheatsheet.pdf ", " cheatsheet.pdf  ")?"[pass]":"[fail]");
        System.out.println("\"" + fileNameManipulator.changeExtensionToLowerCase(" EXEfile.EXE ") + "\"");
        System.out.println(fileNameManipulator.replaceStringPart("Indul a török aludni.", "török", "görög"));
    }
}
