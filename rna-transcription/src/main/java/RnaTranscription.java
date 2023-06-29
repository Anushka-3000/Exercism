import java.util.stream.Collectors;
class RnaTranscription {
  private static String dnaToRna(int c) {
    switch ((char) c) {
      case 'G': return "C";
      case 'C': return "G";
      case 'T': return "A";
      case 'A': return "U";
      default:
        throw new IllegalArgumentException("No mapping for {" + (char) c + "}.");
    }
  }
  String transcribe(String dnaStrand) {
    return dnaStrand.chars()
        .mapToObj(RnaTranscription::dnaToRna)
        .collect(Collectors.joining());
  }
}
