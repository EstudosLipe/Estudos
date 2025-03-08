<?php
function sumEvenNumbers($numPos){
    $soma = 0;
    for($i=1; $i<$numPos; $i++){
        if($i%2==0){
            echo "$soma+$i = ".$soma = $soma+$i;
            echo "\n";
        }
    }
    return $soma;
}
echo sumEvenNumbers(12);