#!/bin/bash
awk '
  {
    for (i=1; i<NF+1; i++) {
      if (NR == 1) {
        matrix[i] = $i;
      } else {
        matrix[i] = matrix[i] " " $i;
      }
    }
  }
  END {
    for (i=1; i<length(matrix); i++) {
      print matrix[i];
    }
  }
' $1

