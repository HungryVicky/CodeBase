section .data
	msg1 db "Enter First Number : "
	len1 equ $- msg1

	msg2 db "Enter First Number : "
	len2 equ $- msg2

	msg3 db "Sum Is : "
	len3 equ $- msg3

section .bss

	value1 resb 4
	value2 resb 4
	sum resb 4

section .text
	global _start

_start:

	mov eax ,4
	mov ebx ,1
	mov ecx ,msg1
	mov edx ,len1

	int 0x80

	mov eax,3
	mov ebx,0
	mov ecx,value1
	mov edx,4

	int 0x80

	mov eax ,4
	mov ebx ,1
	mov ecx ,msg2
	mov edx ,len2

	int 0x80

	mov eax,3
	mov ebx,0
	mov ecx,value2
	mov edx,4
	
	int 0x80

	mov eax, [value1]
	sub eax,'0'
	mov ebx, [value2]
	sub ebx,'0'

	add eax,ebx
	add eax,'0'
	
	mov [sum] ,eax

	mov eax,4
	mov ebx,1
	mov ecx,msg3
	mov edx,len3

	int 0x80

	mov eax ,4
	mov ebx ,1
	mov ecx ,sum
	mov edx ,2

	int 0x80

	mov eax,1
	int 0x80