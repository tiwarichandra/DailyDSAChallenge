package com.tiwari.daily_dsa.StringPKG;

public class LongestPrifix {
    public static void main(String[] args) {
        String[] arr = {"lopuvndzymqhfjbhgxfueaoesngtjaywopqlcwlciblqkmxsmcosecxwrfsbfqxwfqhjmsmwvxohmmzaqnsvrrtjxlmeb", "aidisrcgoyfcfrqhrhumcodxzcjnhmahverpvuxlucqzwign", "dzttfruhahqohyjlrajnxwhcojyxrlmwnipsbjbdssrasdnjdyzdvifjrdijqvfffxxg", "bjbtadnfsyjrxoogtzxyiiofqukptsx", "darffelyduraifideibmqrrindxhxxfaxxgfb", "denuhxbpafxduqunyityrqxwrwvxbxqedfakcbaehzhdpdqqnjqeandtjyslxirbpsnrtpxcpefgjyyxjodldiep", "waggtjvlxohmljdrrkbriaazfmeostxrtfxnrvaolhcxtgqmstdatfbztgpmzmdvtckkxk", "judipja", "bugdplhqfnfrotwjnytxygyjadtrotspnyudlbvqqbjfufojgkjeqjpsmijabbrrblwoprffsqkpyzyejh", "bqztejcekfxbilxwapdfjusyurzacikfblyfu", "mgjjiruhpwytcipwijphjrqvyriyycakklwsesctpaotkdptoecxxuuvnctmgvyrgwlmr", "fgqubczqvowanvwiskmlytiymqxxconjwdfxffpdvnfkibuanhnlcvmo", "jlrzyavdis", "nhokutuewpekyrxaolodwzuvawqdeiotrednxarwrxipofpetfhpedlgcbmgmaadffrehkcyiknyscflho", "osnwupicbjegqkxwrkzqsjfsdkxotmrheegavocyzhfrteo", "oneiykbcuysnklxqsdqntvotetmxxajopoyqazuuamjkaidsnvhhqvcuootordegtcyvcspchaohjtbwp", "ffehcsyxipamxvp", "qtqhvzklitfjrusxbwgfqgdzxfnxdcvtvndsnnevilf", "fzyivhqlpt", "naakdehzcwcujrahzloasnzdiitvx", "kkomwsqfrscvpnmpulbilvxmyhurdufpewbdotkhomcdaquwdvhotedrmzlrtsiao", "dcenlucpzefucirjzkqccebpvvhfxwqaawpmrtbqxjka", "clsmbuqfyfcvpjslzulwlzpfdf", "osghuuaivubduihpxrjisdwqpxfwclcqfjyzdyjaukfpvngsgqbavzrkwwibjlrowppzpzbklhbgwjzezcevdvhzusadd", "szlhabibnwkqegzdkbhrwkmfmgxomciedwndxwhmsrewadckeldcyqkkyjakmlqphevgccuwvyuvdwgkkjmibyuci", "owfhloliupkolgmfdqejaovoyypucxotvwaiklrfcdvnlispayacmxsmwhgagxtbttkfgdmigixssqj", "qjwfhqrfyyfgxbiquuxdxmnfulzodiitsgybwqgwq", "dnmnfjjeoiqbnkmnarxi", "rqlsndyjvmoiabplkuzskbixpxzjuiwmyhgnnfzitnttpifbegwrjeqbdpkxxglypu", "czmluaenroustdokmuan", "rzxrfkrveexfrkztonkdjcymtkbnmoldokuvulqzqqejaecr", "owesurleszqimvywquqdmrtewehciyvwwzpqscwmboxpjvlbrefgvyktftvntsmpudhmfdbjryadvmensjtnkfjpzgeuzq", "tvrhdvkooiorgcwtufokpvtgwzlraddvz", "ferpsiagzglxbffprwmkdjmoamtdkszpytesbgzcmmanrhejdrvgajwcyqhikgxjbdbcmcfyohoiouttnoanywrymyg", "hfikkjnwmuxc", "lkthdmvuokulcszcyylfgwpqlmehjikwtfdyrauilotpgutgthlzfbrspvzyelwzqbzjcurpkmgrhbzainzpqrhfoi", "utbvlevxiroxbbfukhukrhlhzeqetbjpum", "isifbztaawgxinrsgagpzkgffhqvdegnwosxnoapmg", "vvfpbhvtggznnidinhobeevdtjdjw" ,"xrgfgkmcdvkeixoo"};


        //   String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};

        String prefix = arr[0];
        for(int index=1;index<arr.length;index++){
            while(arr[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        if (!prefix.isEmpty()) {
            System.out.println(prefix);
        }
        System.out.println(-1);

    }
}
