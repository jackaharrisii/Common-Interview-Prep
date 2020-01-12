package test.jack.com.questions.Sorting;

import main.jack.com.questions.Sorting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTests {

    Sorting sorting = new Sorting();
    Integer[] tenIntegers;
    Integer[] thousandIntegers;
    String[] tenWords;
    String[] thousandWords;

    @Before
    public void setUp() throws Exception {
        tenIntegers = new Integer[]{1, 7, 4, 3, 67, 5, 7, 23, 96, 85};
        thousandIntegers = new Integer[]{873, 906, 568, 478, 168, 101, 420, 955, 766, 85, 690, 584, 361, 448, 138, 343, 103, 355, 125, 157, 302, 504, 936, 536, 433, 841, 880, 289, 574, 686, 28, 911, 434, 271, 243, 565, 391, 353, 618, 989, 90, 465, 845, 2, 38, 929, 327, 702, 238, 822, 669, 398, 718, 884, 410, 713, 415, 508, 284, 57, 185, 16, 171, 800, 112, 897, 299, 493, 27, 19, 464, 676, 797, 925, 396, 607, 905, 767, 943, 488, 974, 105, 872, 113, 557, 789, 719, 80, 224, 96, 116, 656, 730, 199, 237, 349, 910, 673, 197, 339, 899, 640, 110, 612, 99, 411, 980, 762, 759, 946, 270, 317, 194, 882, 507, 578, 364, 535, 225, 461, 773, 363, 515, 310, 931, 277, 381, 346, 92, 482, 122, 149, 611, 203, 680, 586, 295, 311, 118, 139, 241, 233, 94, 201, 940, 827, 487, 887, 542, 758, 48, 77, 86, 791, 551, 254, 335, 694, 749, 761, 861, 501, 312, 824, 424, 14, 436, 737, 635, 205, 147, 662, 521, 404, 687, 839, 539, 486, 973, 479, 532, 867, 832, 177, 833, 287, 4, 64, 918, 467, 666, 938, 775, 858, 84, 68, 926, 186, 545, 323, 755, 776, 91, 700, 256, 451, 326, 437, 987, 298, 280, 643, 831, 269, 305, 698, 659, 795, 538, 222, 492, 140, 763, 889, 645, 966, 937, 739, 252, 722, 152, 242, 852, 883, 727, 170, 228, 728, 596, 517, 466, 566, 216, 276, 582, 965, 661, 592, 695, 792, 331, 230, 366, 30, 848, 869, 62, 663, 192, 291, 164, 357, 6, 747, 933, 604, 614, 8, 522, 232, 73, 417, 520, 56, 97, 257, 245, 528, 603, 60, 540, 781, 263, 462, 371, 202, 484, 859, 320, 485, 752, 671, 962, 207, 59, 879, 847, 303, 816, 468, 923, 594, 874, 799, 313, 209, 660, 622, 172, 948, 751, 426, 709, 810, 981, 408, 979, 378, 296, 98, 583, 672, 58, 1000, 342, 78, 497, 627, 156, 530, 877, 41, 599, 543, 423, 136, 198, 469, 711, 212, 440, 890, 3, 580, 953, 253, 135, 895, 470, 916, 992, 293, 294, 757, 17, 369, 552, 71, 706, 851, 644, 815, 818, 281, 697, 678, 25, 219, 401, 34, 427, 825, 23, 692, 638, 534, 849, 15, 745, 239, 11, 784, 499, 438, 631, 304, 770, 235, 512, 483, 244, 838, 941, 442, 95, 458, 250, 83, 642, 432, 345, 108, 956, 217, 537, 422, 500, 102, 811, 121, 161, 595, 29, 188, 577, 652, 854, 610, 443, 115, 547, 376, 158, 840, 142, 213, 419, 175, 403, 255, 332, 725, 920, 555, 546, 891, 454, 600, 959, 431, 456, 560, 982, 585, 984, 180, 154, 274, 392, 496, 587, 704, 406, 842, 26, 226, 834, 564, 664, 70, 531, 285, 319, 208, 221, 771, 654, 949, 809, 954, 712, 649, 133, 88, 275, 996, 13, 710, 525, 561, 794, 670, 107, 971, 329, 389, 699, 514, 802, 693, 616, 857, 650, 236, 688, 360, 324, 506, 837, 817, 49, 790, 934, 258, 393, 495, 472, 218, 881, 533, 744, 362, 206, 682, 985, 685, 835, 282, 696, 173, 182, 341, 204, 703, 632, 223, 653, 141, 87, 446, 630, 266, 288, 155, 523, 581, 796, 428, 367, 668, 359, 978, 892, 414, 519, 39, 169, 318, 72, 864, 473, 126, 416, 988, 805, 559, 579, 191, 333, 588, 957, 736, 474, 924, 939, 119, 748, 377, 723, 383, 425, 593, 628, 453, 855, 384, 513, 567, 634, 626, 778, 388, 160, 819, 382, 145, 935, 10, 249, 338, 491, 907, 395, 999, 457, 932, 909, 290, 409, 334, 82, 1, 76, 328, 912, 100, 853, 768, 798, 439, 106, 510, 733, 174, 862, 875, 21, 375, 572, 336, 677, 803, 997, 658, 196, 860, 944, 494, 732, 120, 47, 553, 190, 455, 137, 691, 65, 134, 37, 605, 570, 128, 836, 960, 227, 804, 12, 89, 178, 502, 131, 708, 774, 964, 412, 69, 505, 386, 179, 350, 689, 20, 444, 705, 526, 52, 990, 347, 489, 51, 429, 558, 463, 993, 901, 681, 394, 589, 779, 189, 418, 399, 903, 967, 639, 968, 945, 265, 651, 449, 868, 665, 46, 772, 231, 756, 569, 53, 44, 354, 846, 144, 279, 374, 193, 195, 617, 970, 123, 477, 229, 701, 151, 22, 286, 246, 637, 878, 278, 301, 629, 176, 914, 844, 400, 621, 615, 647, 657, 114, 54, 915, 50, 865, 344, 32, 998, 563, 365, 674, 518, 908, 43, 33, 721, 55, 633, 162, 163, 18, 93, 503, 715, 450, 740, 720, 995, 893, 300, 340, 780, 385, 390, 777, 814, 214, 35, 184, 129, 325, 919, 609, 268, 321, 729, 871, 624, 866, 717, 368, 348, 166, 397, 961, 575, 602, 826, 620, 132, 646, 928, 5, 7, 808, 262, 850, 793, 460, 81, 516, 601, 447, 898, 785, 764, 562, 314, 975, 283, 550, 782, 292, 927, 921, 726, 976, 576, 309, 316, 856, 372, 648, 573, 248, 307, 963, 942, 922, 930, 556, 597, 716, 220, 787, 896, 812, 476, 413, 42, 421, 187, 24, 471, 234, 977, 210, 683, 636, 608, 264, 36, 481, 330, 952, 913, 902, 746, 247, 74, 380, 387, 821, 490, 950, 259, 480, 251, 9, 273, 765, 843, 524, 31, 146, 40, 405, 351, 130, 571, 124, 356, 306, 459, 823, 983, 655, 623, 828, 830, 760, 750, 807, 900, 45, 337, 211, 613, 159, 322, 67, 917, 783, 150, 820, 527, 200, 606, 667, 904, 79, 407, 267, 181, 863, 272, 544, 498, 641, 373, 806, 986, 735, 788, 679, 886, 167, 308, 731, 370, 261, 598, 888, 153, 753, 894, 684, 215, 315, 435, 183, 165, 951, 63, 801, 240, 148, 358, 724, 445, 870, 430, 554, 958, 61, 813, 876, 741, 675, 769, 972, 352, 625, 742, 379, 743, 111, 260, 994, 66, 109, 75, 441, 754, 738, 511, 452, 947, 127, 707, 786, 475, 117, 590, 714, 591, 734, 297, 402, 509, 991, 143, 541, 549, 619, 529, 969, 885, 548, 829, 104};
        tenWords = new String[]{"dog", "cat", "bird", "fish", "worm", "bat", "feline", "cheese", "cat", "book"};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void bubbleSort_ten_integers_Test() {
        Integer[] expected = new Integer[]{1, 3, 4, 5, 7, 7, 23, 67, 85, 96};
        sorting.bubbleSort(tenIntegers);
        assertArrayEquals(expected, tenIntegers);
    }

    @Test
    public void bubbleSort_thousand_integers_Test(){
        Integer[] expected = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,433,434,435,436,437,438,439,440,441,442,443,444,445,446,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,480,481,482,483,484,485,486,487,488,489,490,491,492,493,494,495,496,497,498,499,500,501,502,503,504,505,506,507,508,509,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,656,657,658,659,660,661,662,663,664,665,666,667,668,669,670,671,672,673,674,675,676,677,678,679,680,681,682,683,684,685,686,687,688,689,690,691,692,693,694,695,696,697,698,699,700,701,702,703,704,705,706,707,708,709,710,711,712,713,714,715,716,717,718,719,720,721,722,723,724,725,726,727,728,729,730,731,732,733,734,735,736,737,738,739,740,741,742,743,744,745,746,747,748,749,750,751,752,753,754,755,756,757,758,759,760,761,762,763,764,765,766,767,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,784,785,786,787,788,789,790,791,792,793,794,795,796,797,798,799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816,817,818,819,820,821,822,823,824,825,826,827,828,829,830,831,832,833,834,835,836,837,838,839,840,841,842,843,844,845,846,847,848,849,850,851,852,853,854,855,856,857,858,859,860,861,862,863,864,865,866,867,868,869,870,871,872,873,874,875,876,877,878,879,880,881,882,883,884,885,886,887,888,889,890,891,892,893,894,895,896,897,898,899,900,901,902,903,904,905,906,907,908,909,910,911,912,913,914,915,916,917,918,919,920,921,922,923,924,925,926,927,928,929,930,931,932,933,934,935,936,937,938,939,940,941,942,943,944,945,946,947,948,949,950,951,952,953,954,955,956,957,958,959,960,961,962,963,964,965,966,967,968,969,970,971,972,973,974,975,976,977,978,979,980,981,982,983,984,985,986,987,988,989,990,991,992,993,994,995,996,997,998,999,1000};
        sorting.bubbleSort(thousandIntegers);
        assertArrayEquals(expected, thousandIntegers);
    }

    @Test
    public void bubbleSort_ten_words_Test(){
        String[] expected = new String[]{"bat", "bird", "book", "cat", "cat", "cheese", "dog", "feline", "fish", "worm"};
        sorting.bubbleSort(tenWords);
        assertArrayEquals(expected, tenWords);
    }

    @Test
    public void bubbleSort_ten_integers_as_generics_Test(){
        Integer[] expected = new Integer[]{1, 3, 4, 5, 7, 7, 23, 67, 85, 96};
        sorting.bubbleSortGeneric(tenIntegers);
        assertArrayEquals(expected, tenIntegers);
    }

    @Test
    public void bubbleSort_thousand_integers_as_generics_Test(){
        Integer[] expected = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,433,434,435,436,437,438,439,440,441,442,443,444,445,446,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,480,481,482,483,484,485,486,487,488,489,490,491,492,493,494,495,496,497,498,499,500,501,502,503,504,505,506,507,508,509,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,656,657,658,659,660,661,662,663,664,665,666,667,668,669,670,671,672,673,674,675,676,677,678,679,680,681,682,683,684,685,686,687,688,689,690,691,692,693,694,695,696,697,698,699,700,701,702,703,704,705,706,707,708,709,710,711,712,713,714,715,716,717,718,719,720,721,722,723,724,725,726,727,728,729,730,731,732,733,734,735,736,737,738,739,740,741,742,743,744,745,746,747,748,749,750,751,752,753,754,755,756,757,758,759,760,761,762,763,764,765,766,767,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,784,785,786,787,788,789,790,791,792,793,794,795,796,797,798,799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816,817,818,819,820,821,822,823,824,825,826,827,828,829,830,831,832,833,834,835,836,837,838,839,840,841,842,843,844,845,846,847,848,849,850,851,852,853,854,855,856,857,858,859,860,861,862,863,864,865,866,867,868,869,870,871,872,873,874,875,876,877,878,879,880,881,882,883,884,885,886,887,888,889,890,891,892,893,894,895,896,897,898,899,900,901,902,903,904,905,906,907,908,909,910,911,912,913,914,915,916,917,918,919,920,921,922,923,924,925,926,927,928,929,930,931,932,933,934,935,936,937,938,939,940,941,942,943,944,945,946,947,948,949,950,951,952,953,954,955,956,957,958,959,960,961,962,963,964,965,966,967,968,969,970,971,972,973,974,975,976,977,978,979,980,981,982,983,984,985,986,987,988,989,990,991,992,993,994,995,996,997,998,999,1000};
        sorting.bubbleSortGeneric(thousandIntegers);
        assertArrayEquals(expected, thousandIntegers);
    }

    @Test
    public void bubbleSort_ten_words_as_generics_Test(){
        String[] expected = new String[]{"bat", "bird", "book", "cat", "cat", "cheese", "dog", "feline", "fish", "worm"};
        sorting.bubbleSortGeneric(tenWords);
        assertArrayEquals(expected, tenWords);
    }

}