package com.kannadabible.tamilbible;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 7/04/2018.
 */
public class BooksChapters {

    public static int  getChaptersCount(int book)
    {
        HashMap<Integer,Integer> booksChapters = new HashMap<Integer,Integer>();
        booksChapters.put(	1 , 50	);
        booksChapters.put(	2 , 40	);
        booksChapters.put(	3 , 27	);
        booksChapters.put(	4 , 36	);
        booksChapters.put(	5 , 34	);
        booksChapters.put(	6 , 24	);
        booksChapters.put(	7 , 21	);
        booksChapters.put(	8 , 4	);
        booksChapters.put(	9 , 31	);
        booksChapters.put(	10 , 24	);
        booksChapters.put(	11 , 22	);
        booksChapters.put(	12 , 25	);
        booksChapters.put(	13 , 29	);
        booksChapters.put(	14 , 36	);
        booksChapters.put(	15 , 10	);
        booksChapters.put(	16 , 13	);
        booksChapters.put(	17 , 10	);
        booksChapters.put(	18 , 42	);
        booksChapters.put(	19 , 150);
        booksChapters.put(	20 , 31	);
        booksChapters.put(	21 , 12	);
        booksChapters.put(	22 , 8	);
        booksChapters.put(	23 , 66	);
        booksChapters.put(	24 , 52	);
        booksChapters.put(	25 , 5	);
        booksChapters.put(	26 , 48	);
        booksChapters.put(	27 , 12	);
        booksChapters.put(	28 , 14	);
        booksChapters.put(	29 , 3	);
        booksChapters.put(	30 , 9	);
        booksChapters.put(	31 , 1	);
        booksChapters.put(	32 , 4	);
        booksChapters.put(	33 , 7	);
        booksChapters.put(	34 , 3	);
        booksChapters.put(	35 , 3	);
        booksChapters.put(	36 , 3	);
        booksChapters.put(	37 , 2	);
        booksChapters.put(	38 , 14	);
        booksChapters.put(	39 , 4	);
        booksChapters.put(	40 , 28	);
        booksChapters.put(	41 , 16	);
        booksChapters.put(	42 , 24	);
        booksChapters.put(	43 , 21	);
        booksChapters.put(	44 , 28	);
        booksChapters.put(	45 , 16	);
        booksChapters.put(	46 , 16	);
        booksChapters.put(	47 , 13	);
        booksChapters.put(	48 , 6	);
        booksChapters.put(	49 , 6	);
        booksChapters.put(	50 , 4	);
        booksChapters.put(	51 , 4	);
        booksChapters.put(	52 , 5	);
        booksChapters.put(	53 , 3	);
        booksChapters.put(	54 , 6	);
        booksChapters.put(	55 , 4	);
        booksChapters.put(	56 , 3	);
        booksChapters.put(	57 , 1	);
        booksChapters.put(	58 , 13	);
        booksChapters.put(	59 , 5	);
        booksChapters.put(	60 , 5	);
        booksChapters.put(	61 , 3	);
        booksChapters.put(	62 , 5	);
        booksChapters.put(	63 , 1	);
        booksChapters.put(	64 , 1	);
        booksChapters.put(	65 , 1	);
        booksChapters.put(	66 , 22	);
        return booksChapters.get(book);
    }

    public static String getBookName(int booknumber) {
        Map<Integer, String> bookName = new HashMap<Integer, String>();
        bookName.put(1, "ஆதியாகமம்-ಆದಿಕಾಂಡ");
        bookName.put(2, "யாத்திராகமம்-ವಿಮೋಚನಕಾಂಡ");
        bookName.put(3, "லேவியராகமம்-ಯಾಜಕಕಾಂಡ");
        bookName.put(4, "எண்ணாகமம்--ಅರಣ್ಯಕಾಂಡ");
        bookName.put(5, "உபாகமம்-ಧರ್ಮೋಪದೇಶಕಾಂಡ");
        bookName.put(6, "யோசுவா-ಯೆಹೋಶುವ");
        bookName.put(7, "நியாயாதிபதிகள்-ನ್ಯಾಯಸ್ಥಾಪಕರು");
        bookName.put(8, "ரூத்-ರೂತಳು");
        bookName.put(9, "1 சாமுவேல்-1 ಸಮುವೇಲನು");
        bookName.put(10, "2 சாமுவேல்-2 ಸಮುವೇಲನು");
        bookName.put(11, "1 இராஜாக்கள்-1 ಅರಸುಗಳು");
        bookName.put(12, "2 இராஜாக்கள்-2 ಅರಸುಗಳು");
        bookName.put(13, "1 நாளாகமம்-1 ಪೂರ್ವಕಾಲವೃತ್ತಾ");
        bookName.put(14, "2 நாளாகமம்-2 ಪೂರ್ವಕಾಲವೃತ್ತಾ");
        bookName.put(15, "எஸ்றா-ಎಜ್ರನು");
        bookName.put(16, "நெகேமியா-ನೆಹೆಮಿಯ");
        bookName.put(17, "எஸ்தர்-ಎಸ್ತೇರಳು");
        bookName.put(18, "யோபு-ಯೋಬನು");
        bookName.put(19, "சங்கீதம்-ಕೀರ್ತನೆಗಳು");
        bookName.put(20, "நீதிமொழிகள்-ಙ್ಞಾನೋಕ್ತಿಗಳು");
        bookName.put(21, "பிரசங்கி-ಪ್ರಸಂಗಿ");
        bookName.put(22, "உன்னதப்பாட்டு-ಪರಮ ಗೀತ");
        bookName.put(23, "ஏசாயா-ಯೆಶಾಯ");
        bookName.put(24, "எரேமியா-ಯೆರೆಮಿಯ");
        bookName.put(25, "புலம்பல்-ಪ್ರಲಾಪಗಳು");
        bookName.put(26, "எசேக்கியேல்-ಯೆಹೆಜ್ಕೇಲನು");
        bookName.put(27, "தானியேல்-ದಾನಿಯೇಲನು");
        bookName.put(28, "ஓசியா-ಹೋಶೇ");
        bookName.put(29, "யோவேல்-ಯೋವೇಲ");
        bookName.put(30, "ஆமோஸ்-ಆಮೋಸ");
        bookName.put(31, "ஒபதியா-ಓಬದ್ಯ");
        bookName.put(32, "யோனா-ಯೋನ");
        bookName.put(33, "மீகா-ಮಿಕ");
        bookName.put(34, "நாகூம்-ನಹೂಮ");
        bookName.put(35, "ஆபகூக்-ಹಬಕ್ಕೂಕ್ಕ");
        bookName.put(36, "செப்பனியா-ಚೆಫನ್ಯ");
        bookName.put(37, "ஆகாய்-ಹಗ್ಗಾಯ");
        bookName.put(38, "சகரியா-ಜೆಕರ್ಯ");
        bookName.put(39, "மல்கியா-ಮಲಾಕಿಯ");
        bookName.put(40, "மத்தேயு-ಮತ್ತಾಯನು");
        bookName.put(41, "மாற்கு-ಮಾರ್ಕನು");
        bookName.put(42, "லூக்கா-ಲೂಕನು");
        bookName.put(43, "யோவான்-ಯೋಹಾನನು");
        bookName.put(44, "அப்போஸ்தலருடைய நடபடிகள்-ಅಪೊಸ್ತಲರ ಕೃತ್ಯಗ");
        bookName.put(45, "ரோமர்-ರೋಮಾಪುರದವರಿಗೆ");
        bookName.put(46, "1 கொரிந்தியர்- 1 ಕೊರಿಂಥದವರಿಗೆ");
        bookName.put(47, "2 கொரிந்தியர் - 2 ಕೊರಿಂಥದವರಿಗೆ");
        bookName.put(48, "கலாத்தியர் - ಗಲಾತ್ಯದವರಿಗೆ");
        bookName.put(49, "எபேசியர் - ಎಫೆಸದವರಿಗೆ");
        bookName.put(50, "பிலிப்பியர்-ಫಿಲಿಪ್ಪಿಯವರಿಗೆ");
        bookName.put(51, "கொலோசெயர்-ಕೊಲೊಸ್ಸೆಯವರಿಗೆ");
        bookName.put(52, "1 தெசலோனிக்கேயர்-1 ಥೆಸಲೊನೀಕದವರಿಗೆ");
        bookName.put(53, "2 தெசலோனிக்கேயர்-2 ಥೆಸಲೊನೀಕದವರಿಗೆ");
        bookName.put(54, "1 தீமோத்தேயு-1 ತಿಮೊಥೆಯನಿಗೆ");
        bookName.put(55, "2 தீமோத்தேயு-2 ತಿಮೊಥೆಯನಿಗೆ");
        bookName.put(56, "தீத்து-ತೀತನಿಗೆ");
        bookName.put(57, "பிலேமோன்-ಫಿಲೆಮೋನನಿಗೆ");
        bookName.put(58, "எபிரெயர்-ಇಬ್ರಿಯರಿಗೆ");
        bookName.put(59, "யாக்கோபு-ಯಾಕೋಬನು");
        bookName.put(60, "1 பேதுரு-1 ಪೇತ್ರನು");
        bookName.put(61, "2 பேதுரு-2 ಪೇತ್ರನು");
        bookName.put(62, "1 யோவான்-1 ಯೋಹಾನನು");
        bookName.put(63, "2 யோவான்-2 ಯೋಹಾನನು");
        bookName.put(64, "3 யோவான்-3  ಯೋಹಾನನು");
        bookName.put(65, "யூதா-ಯೂದನು");
        bookName.put(66, "வெளிப்படுத்தின விசேஷம்-ಪ್ರಕಟನೆ");
        return bookName.get(booknumber);

    }

}
