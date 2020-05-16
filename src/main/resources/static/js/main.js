
$(document).ready(function(){

    $('.nBtn, .table .eBtn').on('click',function(event){

        event.preventDefault();

        var href = $(this).attr('href');
        var text = $(this).text();

        $('#div1').hide();
        $('#div2').hide();
        $('#div3').show();


        if (text == 'Edit'){

            $.get(href,function(miniatura,status){
                $('#bForm #id').val(miniatura.id);
                $('#bForm #marca').val(miniatura.marca);
                $('#bForm #modelo').val(miniatura.modelo);
            });

        } else {

            $('#bForm #id').val('');
            $('#bForm #marca').val('');
            $('#bForm #modelo').val('');

        }
    });

    $('.table .delBtn').on('click',function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $('#myModal #delRef').attr('href', href);
        $('#myModal').modal();

    });


});