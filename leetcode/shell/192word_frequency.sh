#!/bin/bash
#cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -r | awk '{ print $2, $1 }'
awk '{
    split($0,words," ");
    for (word in words)
      { 
        w=tolower($word);
        wc[w]++;
      }
  }
  END {
    for (word in wc)
    {
      print word" "wc[word]
    }
  }
' $1 | sort -nr -k 2
