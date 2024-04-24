<?php

    $host="localhost";
    $user="root";
    $password="WENDY_739597";
    $dbName="zazaero_copy";



    function decrypt_new($encrypted_text, $opt='DB') {
        if($opt == 'SESS') {
            $key        = "%ie84h->MRComtf!7ro@&9f8";// 24 bit Key
        } else {
            $key        = "1*10Q{f2MRComt!7ros.&9f8";// 24 bit Key
        }
        $iv         = "rkddl402";// 8 bit IV - 8글자로 제한


        $plainText = openssl_decrypt(base64_decode($encrypted_text), 'AES-128-CBC', $key, OPENSSL_RAW_DATA, $iv);
        // unpad가 필요하다면
        //$plainText = pkcs5_unpad(openssl_decrypt($cipherText, 'AES-128-CBC', $key, OPENSSL_RAW_DATA, $iv));
        return $plainText;
    }
?>