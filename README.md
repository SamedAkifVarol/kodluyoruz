# Kodluyoruz
www.patika.dev Kursu
## Insertion Sort Projesi
---
### [22,27,16,2,18,6] -> Insertion Sort
  
    1. [2,27,16,22,18,6]
    2. [2,6,16,22,18,27]
    3. [2,6,16,22,18,27] bu aşamada 16 zaten en küçük
    4. [2,6,16,18,22,27]

### Big-O-Gösterimi
    O(n²)

### Time Complexity
    Worst Case = n²
    Average Case = n²
    Best Case = n

### Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer?
    Average case


## Merge Projesi
---
### [16,21,11,8,12,22] -> Merge Sort
    
     [16,21,11] | [8, 12, 22] 

     [16],[21,11] | [8],[12,22]

     [16],[21],[11] | [8],[12],[22]

     [11,16,21] | [8,12,22]

     [8,11] ilk bunlar kendi aralarında
     [12,16] sonra bunlar
     [21,22] en son bunlar

     [8,11,12,16,21,22] 

### Big-O-Gösterimi
    O(nlogn)

## Binary Search Tree Projesi
---
## [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını
    Root =3
    Sırayla gidersek;
                3
            2       4
        1               5
    0                       6
                                7
                                    8
                                        9
