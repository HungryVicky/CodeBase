section .data
	msg db "Enter A Number : "
	len equ $- msg
	msg2 db "You Entered Number : "
	len2 equ $- msg2 
	
section .bss
	value resb 5

section .text
	global _start
_start:
	
	mov eax,4
	mov ebx,1
	mov ecx,msg
	mov edx,len

	int 0x80

	mov eax,3
	mov ebx,0
	mov ecx,value
	mov edx,5

	int 0x80

	mov eax,4
	mov ecx,msg2
	mov edx,len2
	mov ebx,1

	int 0x80

	mov eax,4
	mov ebx,1
	mov ecx,value
	mov edx,5

	int 0x80

	mov eax,1
	int 0x80