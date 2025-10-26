# TDE-Ordenação
# Pontifícia Universidade Católica do Paraná
Aluno: André Vinícius Martins de Souza Acosta de Jesus

# Tabela de resultado por vetor

| Algoritmo          | Vetor 1       | Vetor 2      | Vetor 3        |
| ------------------ | ------------- | ------------ | -------------- |
| **Bubble Sort**    | I: 180, T: 78 | I: 19, T: 0  | I: 190, T: 190 |
| **Cocktail Sort**  | I: 154, T: 78 | I: 19, T: 0  | I: 190, T: 190 |
| **Selection Sort** | I: 190, T: 18 | I: 190, T: 0 | I: 190, T: 10  |
| **Comb Sort**      | I: 129, T: 22 | I: 110, T: 0 | I: 129, T: 18  |
| **Bucket Sort**    | I: 72, T: 19  | I: 70, T: 0  | I: 102, T: 63  |

# Ranking por menos trocas (mais eficiente na manipulação de elementos)

| Vetor | 1º                                   | 2º               | 3º               | 4º                    | 5º |
| ----- | ------------------------------------ | ---------------- | ---------------- | --------------------- | -- |
| 1     | Selection Sort (18)                  | Bucket Sort (19) | Comb Sort (22)   | Bubble/Cocktail (78)  | -  |
| 2     | Bucket/Selection/Cocktail/Bubble (0) | -                | -                | -                     | -  |
| 3     | Selection Sort (10)                  | Comb Sort (18)   | Bucket Sort (63) | Bubble/Cocktail (190) | -  |

# Ranking por menos iterações (mais eficiente nos laços)

| Vetor | 1º                                                                       | 2º              | 3º                    | 4º                   | 5º                   |
| ----- | ------------------------------------------------------------------------ | --------------- | --------------------- | -------------------- | -------------------- |
| 1     | Bucket Sort (72)                                                         | Comb Sort (129) | Cocktail Sort (154)   | Bubble Sort (180)    | Selection Sort (190) |
| 2     | Bucket/Cocktail/Bubble (19-70-110-190) → melhor Bucket? Podemos detalhar | -               | -                     | -                    | -                    |
| 3     | Bucket Sort (102)                                                        | Comb Sort (129) | Bubble/Cocktail (190) | Selection Sort (190) | -                    |


