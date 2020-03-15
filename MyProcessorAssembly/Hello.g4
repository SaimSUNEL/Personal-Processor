/**
"* Define a grammar called Hello
 */
grammar Hello;
program  : (komutlar | interrupt_fonksiyonu )+ ;         // match keyword hello followed by an identifier



komutlar :

r_type_komutlar
| 
i_type_komutlar
|
j_type_komutlar 
|
stack_commands
|
math_commands
|
high_level_commands
| special_komutlar 
|
label_definition 
//| comment
; 

interrupt_fonksiyonu:
'interrupt' '{'

 ( komutlar )*

'}' #interrupt_fonk;

label_definition:
label ':'  #label_process
;


special_komutlar:

special_komut_ismi reg_def #save_pc_to_result
|
'call' immediate #foksiyon_cagirma
|
'call' label #labelli_call
|
'return' #return_from_function
| 'nop' #nop_operation

;
special_komut_ismi: 'save_pc';





high_level_commands :
mov_komutu

;


mov_komutu :

'mov' destination ',' source #mov_high



;





destination:

'[' reg_or_immediate ']' #jk
|
reg_def #jn
 
;

reg_or_immediate:
reg_def | immediate 

;


source :
'[' reg_or_immediate ']' #getir
|
reg_def #kl
|
immediate#imm



;



math_commands:

math_komut_ismi reg_def #math_komutu


;
math_komut_ismi :
'incf' | 'decf'
;

stack_commands :
stack_komut_ismi  reg_def #stack_komutu
;

stack_komut_ismi:
'push' | 'pop'
;
reg_def : 
'$'  ( 'sp'   | 'result' | immediate )

;


r_type_komutlar:
r_type_komut_ismi reg_def ',' reg_def #r_type_komut
 


;
r_type_komut_ismi:
'lw' | 'sw' | 'add' | 'sub' | 'mov_fast' | 'slt' | 'beq' | 'bnq' | 'and' | 'or' | 'mul' | 'shr'
;


i_type_komutlar:
i_type_komut_ismi reg_def ',' immediate #i_type_komut

;

j_type_komutlar : 
j_type_komut_ismi jump_to #j_type_komut
| j_type_komut_ismi label#labelli_komut
;
jump_to :
immediate | reg_def
;

j_type_komut_ismi :
'jmp'
;


i_type_komut_ismi :
'lwi' | 'swi' | 'lui' | 'addi' | 'movi' | 'out' | 'in' | 'bsf' | 'bcf' | 'get_bit'

;

label:
ID 
;



//YORUM: ( [ A-Z | a-z  | ' ' ]+ )


//;


immediate :
NUM
;


NEWLINE :

[\r\n]
;

NUM : ( '-'| )  [0-9]+;

ID : [a-z|A-Z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines


