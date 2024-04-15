// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: regular.jflex


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lab1 {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\0\1\3\22\0\1\4\1\0"+
    "\1\5\1\6\4\0\1\7\1\10\1\11\3\0\1\12"+
    "\1\13\12\14\2\0\1\15\1\0\1\16\2\0\32\17"+
    "\1\20\1\21\1\22\1\23\2\0\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\17\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\17\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\0"+
    "\1\54\u0383\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\3\1\1\3\20\4\4\0\7\4"+
    "\1\5\4\4\1\5\13\4\3\0\1\6\1\7\30\4"+
    "\3\0\16\4\2\0\7\4\2\0\2\4\16\0\1\10"+
    "\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\55\0\132\0\207\0\264\0\341\0\u010e"+
    "\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276"+
    "\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1\0\u03de"+
    "\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf\0\u04ec\0\u0519\0\u0546"+
    "\0\u0573\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0654\0\u0681\0\u06ae"+
    "\0\u013b\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f\0\u07bc\0\u07e9"+
    "\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7\0\u0924\0\55"+
    "\0\55\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\u0a32\0\u0a5f"+
    "\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d\0\u0b9a\0\u0bc7"+
    "\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8\0\u0cd5\0\u0d02\0\u0d2f"+
    "\0\u0d5c\0\u0d89\0\u0db6\0\u0de3\0\u0e10\0\u0e3d\0\u0e6a\0\u0e97"+
    "\0\u0ec4\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5\0\u0fd2\0\u0fff"+
    "\0\u102c\0\u1059\0\u1086\0\u10b3\0\u10e0\0\u110d\0\u113a\0\u1167"+
    "\0\u1194\0\u11c1\0\u11ee\0\u121b\0\u1248\0\u1275\0\u12a2\0\u12cf"+
    "\0\u12fc\0\u1329\0\u1356\0\u1383\0\u13b0\0\u13dd\0\u140a\0\u1437"+
    "\0\u1464\0\u1491\0\u14be\0\u14eb\0\u1518\0\55\0\55";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\3\1\5\1\6\4\2\1\7"+
    "\1\10\2\2\1\11\4\2\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\11\1\21\1\11\1\22\4\11"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\3\11\1\2"+
    "\57\0\1\3\61\0\1\31\101\0\1\32\31\0\1\33"+
    "\57\0\1\10\52\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\30\11\13\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\22\11\1\36\5\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\17\11\1\37\10\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\1\40\6\11\1\41"+
    "\5\11\1\42\12\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\4\11\1\43\10\11\1\44\12\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\12\11\1\40"+
    "\1\11\1\45\10\11\1\46\2\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\12\11\1\47\2\11\1\50"+
    "\12\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\15\11\1\36\12\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\5\11\1\51\6\11\1\52\13\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\15\11\1\53"+
    "\12\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\4\11\1\54\23\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\7\11\1\55\1\56\10\11\1\57\2\11"+
    "\1\60\3\11\13\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\26\11\1\61\1\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\14\11\1\62\13\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\15\11\1\63\12\11"+
    "\13\0\1\34\1\0\1\35\2\0\1\11\4\0\7\11"+
    "\1\64\20\11\21\0\1\65\74\0\1\66\20\0\1\67"+
    "\6\0\1\70\1\33\2\0\1\33\4\0\30\33\34\0"+
    "\1\71\35\0\1\35\2\0\1\35\4\0\30\35\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\21\11\1\72"+
    "\6\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\4\11\1\73\23\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\20\11\1\74\7\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\1\50\27\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\14\11\1\75\13\11"+
    "\13\0\1\34\1\0\1\35\2\0\1\11\4\0\5\11"+
    "\1\76\22\11\13\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\22\11\1\77\5\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\22\11\1\100\5\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\21\11\1\101\6\11"+
    "\13\0\1\34\1\0\1\35\2\0\1\11\4\0\15\11"+
    "\1\102\12\11\13\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\17\11\1\51\10\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\21\11\1\51\6\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\14\11\1\103\13\11"+
    "\13\0\1\34\1\0\1\35\2\0\1\11\4\0\6\11"+
    "\1\104\12\11\1\105\6\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\15\11\1\106\12\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\6\11\1\107\20\11"+
    "\1\110\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\1\111\16\11\1\112\10\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\10\11\1\113\17\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\16\11\1\114\11\11"+
    "\13\0\1\34\1\0\1\35\2\0\1\11\4\0\10\11"+
    "\1\115\7\11\1\116\7\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\10\11\1\117\1\11\1\120\15\11"+
    "\13\0\1\34\1\0\1\35\2\0\1\11\4\0\10\11"+
    "\1\121\17\11\24\0\1\122\57\0\1\123\32\0\1\67"+
    "\6\0\1\70\1\124\2\0\1\124\4\0\30\124\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\15\11\1\51"+
    "\12\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\1\125\27\11\13\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\4\11\1\51\23\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\20\11\1\52\1\126\6\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\1\127\27\11"+
    "\13\0\1\34\1\0\1\35\2\0\1\11\4\0\1\11"+
    "\1\121\26\11\13\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\13\11\1\51\14\11\13\0\1\34\1\0\1\35"+
    "\2\0\1\11\4\0\4\11\1\130\23\11\13\0\1\34"+
    "\1\0\1\35\2\0\1\11\4\0\1\52\27\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\6\11\1\51"+
    "\21\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\10\11\1\131\17\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\22\11\1\130\5\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\17\11\1\52\10\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\14\11\1\132"+
    "\13\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\4\11\1\133\23\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\21\11\1\134\6\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\22\11\1\135\5\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\21\11\1\136"+
    "\6\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\4\11\1\137\23\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\15\11\1\140\12\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\10\11\1\141\17\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\3\11\1\51"+
    "\24\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\1\142\27\11\13\0\1\34\1\0\1\35\2\0\1\11"+
    "\4\0\12\11\1\74\15\11\6\0\1\143\105\0\1\144"+
    "\31\0\1\70\1\124\2\0\1\124\4\0\30\124\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\11\11\1\51"+
    "\16\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\10\11\1\145\17\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\22\11\1\146\5\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\17\11\1\140\10\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\20\11\1\147"+
    "\7\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\4\11\1\117\23\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\15\11\1\150\12\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\10\11\1\151\17\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\2\11\1\52"+
    "\25\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\2\11\1\152\25\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\3\11\1\153\24\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\14\11\1\51\13\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\6\11\1\107"+
    "\21\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\21\11\1\64\6\11\3\0\1\154\120\0\1\155\20\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\14\11\1\156"+
    "\13\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\12\11\1\52\15\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\21\11\1\157\6\11\13\0\1\34\1\0"+
    "\1\35\2\0\1\11\4\0\5\11\1\51\22\11\13\0"+
    "\1\34\1\0\1\35\2\0\1\11\4\0\2\11\1\51"+
    "\25\11\13\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\7\11\1\51\20\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\4\11\1\150\23\11\4\0\1\160\100\0"+
    "\1\161\37\0\1\34\1\0\1\35\2\0\1\11\4\0"+
    "\22\11\1\74\5\11\13\0\1\34\1\0\1\35\2\0"+
    "\1\11\4\0\4\11\1\50\23\11\23\0\1\162\62\0"+
    "\1\163\100\0\1\164\4\0\1\165\10\0\1\166\60\0"+
    "\1\167\50\0\1\166\56\0\1\170\4\0\30\170\13\0"+
    "\1\171\54\0\1\172\4\0\1\170\4\0\30\170\11\0"+
    "\1\173\77\0\1\174\32\0\1\175\61\0\1\176\43\0"+
    "\1\177\47\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5445];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\25\1\4\0\30\1\3\0\2\11\30\1"+
    "\3\0\16\1\2\0\7\1\2\0\2\1\16\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[127];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lab1(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.print(yytext());
            }
            // fall through
          case 10: break;
          case 2:
            { System.out.println(yytext());
            }
            // fall through
          case 11: break;
          case 3:
            { System.out.println("<FONT COLOR=\"#FFA500\">" + yytext() + "</FONT>");
            }
            // fall through
          case 12: break;
          case 4:
            { System.out.println("<FONT COLOR=\"#008000\">" + yytext() + "</FONT>");
            }
            // fall through
          case 13: break;
          case 5:
            { System.out.println("<FONT COLOR=\"#0000FF\">" + yytext() + "</FONT>");
            }
            // fall through
          case 14: break;
          case 6:
            { System.out.println("<FONT COLOR=\"#FF00FF\">" + yytext() + "</FONT>");
            }
            // fall through
          case 15: break;
          case 7:
            { System.out.println("<FONT COLOR=\"#FF0000\">" + yytext() + "</FONT>");
            }
            // fall through
          case 16: break;
          case 8:
            { String s = yytext(); s = s.split(" ")[1]; System.out.println("<FONT COLOR=\"#00FF00\">#include &lt;" + s + ".h&gt;</FONT>");
            }
            // fall through
          case 17: break;
          case 9:
            { System.out.println("<FONT COLOR=\"#800080\">" + yytext() + "</FONT>");
            }
            // fall through
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lab1 [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lab1 scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lab1(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
