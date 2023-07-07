class RnaTranscription {
  String transcribe(String dnaStrand) {
    StringBuilder rnaStrand = new StringBuilder();
    char[] dna = dnaStrand.toCharArray();
    for (char character : dna) {
      switch (character) {
        case 'G':
          rnaStrand.append('C');
          break;
        case 'C':
          rnaStrand.append('G');
          break;
        case 'T':
          rnaStrand.append('A');
          break;
        case 'A':
          rnaStrand.append('U');
          break;
        default:
          throw new IllegalArgumentException("Invalid input");
      }
    }
    return rnaStrand.toString();
  }
}
  