
$(document).ready(function(){

    $('.nBtn').show();
    $('#div1').hide();

    $('.nBtn, .table .eBtn').on('click',function(event){

        event.preventDefault();

        var href = $(this).attr('href');
        var text = $(this).text();

        $('#div1').show();
        $('.nBtn').hide();

        if (text == 'Edit'){

            $.get(href,function(pais,status){
                $('#bForm #id').val(pais.id);
                $('#bForm #nome').val(pais.nome);
            });

        } else {

            $('#bForm #id').val('');
            $('#bForm #nome').val('');

        }
    });

    $('.table .delBtn').on('click',function (event) {
         event.preventDefault();
         var href = $(this).attr('href');

         $('#divM #delRef').attr('href', href);
         $('#divM').modal();
    });

});