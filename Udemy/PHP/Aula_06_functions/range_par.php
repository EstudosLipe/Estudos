<?php
    function RangePar(){
        $nums = [1,2,3,4,5,6,7,8,9];

        foreach ($nums as $key=>$value){
            if($value%2==0){
                echo $nums[$key]."\n";
            }
        }
    }

    RangePar();
?>