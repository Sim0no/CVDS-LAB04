# CVDS-LAB04

## Clases de Equivalencia OriginalScore 

| Numero | Especificación                          | Valido/no Valido |
|--------|-----------------------------------------|------------------|
| 1      | 0>=incorrectCount<=10 & CorrectCount>=0 | valid            |
| 2      | correctCount<0 or incorrectCount<0      | invalid          |
| 3      | incorrectCount>10                       | invalid          |

Frontera

0>=incorrectCount<=10 & CorrectCount>=0 & 

      calculateScore(0,0) Limite Inferior
      calculateScore(SIN_LIMITE,10) Limite Superior (SIN_LIMITE se refiere a la precision máxima del número).
      
correctCount<0 or incorrectCount<0

      calculateScore(-1,-1) Limite inferior
      
incorrectCount>10  

      calculateScore(0,11) Limite Superior

     
## Clases de Equivalencia BonusScore

| Numero | Especificación                                                          | Valido/no Valido |
|--------|-------------------------------------------------------------------------|------------------|
| 1      | correctCount/2 < IncorrectCount                                         | Invalid          |
| 2      | correctCount<0 or incorrectCount<0                                      | invalid          |
| 3      | correctCount/2 >= IncorrectCount & CorrectCount>=0 & IncorrectCount >=0 | Valid            |

Frontera

correctCount/2 < IncorrectCount & (correctCount >= 0 & incorrectCount >=0)

      calculateScore(0,1) Inferior


correctCount<0 or incorrectCount<0

      calculateScore(-1,-1) Limite Superior

correctCount/2 >= incorrectCount & correctCount>=0 & incorrectCount >=0
      CalculateScore(1,0) Limite Inferior
      CalculateScore(0,0) Limite Inferior


## Clases de Equivalencia PowerBonusScore

| Numero | Especificación                                                                       | Valido/no Valido |
|--------|--------------------------------------------------------------------------------------|------------------|
| 1      | 5^CorrectCount < 8*IncorrectCount                                                    | invalid          |
| 2      | 5^CorrectCount -8*IncorrectCount > 500                                               | Invalid          |
| 3      | IncorrectCount <0 or CorrectCount<0                                                  | Invalid          |
| 4      | (5^CorrectCount >= 8*IncorrectCount) &                                               | Valid            |
|        | (5^CorrectCount -8*IncorrectCount <= 500) & (IncorrectCount >=0 & CorrectCount >= 0) |                  |

Frontera

5^CorrectCount < 8*IncorrectCount & (IncorrectCount >=0 & CorrectCount>=0)
      
      calculateScore(0,1) Limite Inferior
       
5^CorrectCount -8*IncorrectCount > 500 & (IncorrectCount >=0 & CorrectCount>=0)

      calculateScore(4,0) Limite Inferior
           
IncorrectCount <0 or CorrectCount<0

      calculateScore(-1,-1) Limite Superior


(5^CorrectCount >= 8*IncorrectCount) & (5^CorrectCount -8*IncorrectCount <= 500) 
& (IncorrectCount >=0 & CorrectCount >= 0)

      calculateScore(1,0) Limite Inferior
      calculateScore(0,0) Limite Inferior
       
     
      

