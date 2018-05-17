public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder complementStr= new StringBuilder(dna);
        int len= dna.length();
        for(int i=0;i<len;i++){
            char currentChar= dna.charAt(i);
            char findComplement= findComplement(currentChar);
            complementStr.setCharAt(i,findComplement);
        }

        return complementStr.toString();
    }

    private static char findComplement(char currentChar) {
        switch(currentChar){
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                return 'S';
        }
    }
}