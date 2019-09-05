# CVDS-LAB04

## Clases de Equivalencia OriginalScore 

| Numero | Especificación                          | Valido/no Valido |
|--------|-----------------------------------------|------------------|
| 1      | 0>=incorrectCount<=10 & CorrectCount>=0 | valid            |
| 2      | correctCount<0 or incorrectCount<0      | invalid          |
| 3      | incorrectCount>10                       | invalid          |

Frontera

0>=incorrectCount<=10 & CorrectCount>=0

      calculateScore(0,0) Limite Inferior
      calculateScore(SIN_LIMITE,10) Limite Superior
      
correctCount<0 or incorrectCount<0

      calculateScore(-1,-1) Limite Superior
      
incorrectCount>10  

      calculateScore(0,10) Limite Inferior

     
## Clases de Equivalencia BonusScore

| Numero | Especificación                                                          | Valido/no Valido |
|--------|-------------------------------------------------------------------------|------------------|
| 1      | correctCount/2 < IncorrectCount                                         | Invalid          |
| 2      | correctCount<0 or IncorrectCount<0                                      | invalid          |
| 3      | correctCount/2 >= IncorrectCount & CorrectCount>=0 & IncorrectCount >=0 | Valid            |
Frontera
calculateScore() Limite Inferior
calculateScore() Limite Superior

## Clases de Equivalencia PowerBonusScore

| Numero | Especificación                                                                       | Valido/no Valido |
|--------|--------------------------------------------------------------------------------------|------------------|
| 1      | 5^CorrectCount < 8*IncorrectCount                                                    | invalid          |
| 2      | 5^CorrectCount -8*IncorrectCount > 500                                               | Invalid          |
| 3      | IncorrectCount <0 or CorrectCount<0                                                  | Invalid          |
| 4      | (5^CorrectCount >= 8*IncorrectCount) &                                               | Valid            |
|        | (5^CorrectCount -8*IncorrectCount <= 500) & (IncorrectCount >=0 & CorrectCount >= 0) |                  |
Frontera
calculateScore() Limite Inferior
calculateScore() Limite Superior

